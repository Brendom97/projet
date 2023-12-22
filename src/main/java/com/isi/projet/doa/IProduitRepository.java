package com.isi.projet.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isi.projet.entities.ProduitEntity;

public interface IProduitRepository extends JpaRepository<ProduitEntity, Integer> {
}
