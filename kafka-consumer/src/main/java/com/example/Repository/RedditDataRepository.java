package com.example.Repository;

import com.example.Entities.RedditData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RedditDataRepository extends JpaRepository<RedditData,Long> {
}
