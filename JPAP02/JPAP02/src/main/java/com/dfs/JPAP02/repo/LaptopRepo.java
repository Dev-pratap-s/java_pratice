package com.dfs.JPAP02.repo;

import com.dfs.JPAP02.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LaptopRepo extends JpaRepository<Laptop ,Long> {
}
