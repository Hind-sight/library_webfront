package com.book.manager.repository;

import com.book.manager.model.Book;
import com.book.manager.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BorrowRepository extends JpaRepository<Borrow,String> {
}
