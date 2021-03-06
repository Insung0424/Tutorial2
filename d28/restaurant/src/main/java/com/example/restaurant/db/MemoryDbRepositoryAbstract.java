package com.example.restaurant.db;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

abstract public class MemoryDbRepositoryAbstract<T extends MemoryDbEntity> implements MemoryDbRepositoryIfs<T>{

    private final List<T> db = new ArrayList<>();

    private int index = 0;

    @Override
    public Optional<T> findById(int index) {
//      db.stream에 들어있는 T 타입에 대한 filter
        return db.stream().filter(it -> it.getIndex() == index).findFirst();
//                                     T extends MemoryDbEntity 에서 가져온 index

    }

    @Override
    public T save(T entity) {
        var optionalEntity = db.stream().filter(it->it.getIndex() == entity.getIndex()).findFirst();
        if (optionalEntity.isEmpty()) {// db에 데이터가 없어서 새로 만드는 경우
            index++;
            entity.setIndex(index); // db 생성
            db.add(entity);
            return entity;
        }
        else{ // db에 이미 데이터가 있는 경우
            var preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);

            deleteById(preIndex); // 이전 db 삭제
            db.add(entity);
            return entity;
        }

    }

    @Override
    public void deleteById(int index) {
        var optionalEntity = db.stream().filter(it->it.getIndex() == index).findFirst();
        if (optionalEntity.isPresent()){
            db.remove(optionalEntity.get());
        }

    }

    @Override
<<<<<<< HEAD
    public List<T> findAll() {
=======
    public List<T> listAll() {
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
        return db;
    }
}
