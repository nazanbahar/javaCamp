package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}

//interface interface i extends eder. 
//JpaRepository (interface)extends et. 
//verdiğin veri tipi için yani Entity anatasyonu ile süslenmiş, nesne için yani Product,
//Product şart;  ayrıca Primary Key de vermemiz gerekiyor.intelicense ona göre hazırlanıyor.
//SONUC: Ürünle ilgili CRUD Operasyonları hazır.