package com.project.Market.persistence;

import com.project.Market.domain.Purchase;
import com.project.Market.domain.repository.PurchaseRepository;
import com.project.Market.persistence.crud.CompraCrudRepositry;
import com.project.Market.persistence.entity.Compra;
import com.project.Market.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepositry compraCrudRepositry;
    @Autowired
    private PurchaseMapper mapper;
    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepositry.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepositry.findByIdCliente(clientId).map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase pusrchase) {
        Compra compra = mapper.toCompra(pusrchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCrudRepositry.save(compra));
    }
}
