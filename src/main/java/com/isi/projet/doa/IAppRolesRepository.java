package com.isi.projet.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isi.projet.entities.AppRolesEntity;

public interface IAppRolesRepository extends JpaRepository<AppRolesEntity, Integer> {
}
