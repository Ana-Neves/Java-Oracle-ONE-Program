package com.literAlura.repository;

import com.literAlura.model.Author;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class AuthorRepository implements JpaRepository<Author, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Author> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Author> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Author> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Author getOne(Long aLong) {
        return null;
    }

    @Override
    public Author getById(Long aLong) {
        return null;
    }

    @Override
    public Author getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Author> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Author> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Author> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public List<Author> findAll() {
        return List.of();
    }

    @Override
    public List<Author> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public <S extends Author> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Author> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Author entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Author> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Author> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Author> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Author> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Author> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Author> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Author> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Author, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
