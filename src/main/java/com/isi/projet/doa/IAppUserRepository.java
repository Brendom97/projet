package com.isi.projet.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isi.projet.entities.AppUserEntity;

public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    AppUserEntity findByEmail(String email);
}
