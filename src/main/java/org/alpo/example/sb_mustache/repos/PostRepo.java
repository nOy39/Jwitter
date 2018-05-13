package org.alpo.example.sb_mustache.repos;

import org.alpo.example.sb_mustache.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by
 *
 * @Author OGI aka nOy39
 * @Date 11.05.2018
 * @Time 14:50
 */

public interface PostRepo extends JpaRepository<Post, Long> {

}
