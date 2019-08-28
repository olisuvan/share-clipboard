package com.jinglei.shareclipboardserver.repository;

import com.jinglei.shareclipboardserver.model.DataObject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "data-object", path = "data-object")
public interface DataObjectRepository extends PagingAndSortingRepository<DataObject, String> {

    List<DataObject> findByContent(String content);
}
