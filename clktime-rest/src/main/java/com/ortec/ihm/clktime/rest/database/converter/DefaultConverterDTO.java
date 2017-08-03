package com.ortec.ihm.clktime.rest.database.converter;

import lombok.AccessLevel;
import lombok.Getter;
import org.modelmapper.ModelMapper;

/**
 * @Author: romain.pillot
 * @Date: 02/08/2017
 */

@Getter(AccessLevel.PROTECTED)
public class DefaultConverterDTO<E, D> implements DTOConverter<E, D> {
    private final ModelMapper mapper;
    private final Class<E> entityClass;
    private final Class<D> dtoClass;

    public DefaultConverterDTO(ModelMapper mapper, Class<E> entityClass, Class<D> dtoClass) {
        this.mapper = mapper;
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    public E fromDto(D dto) {
        return mapper.map(dto, entityClass);
    }

    public D fromEntity(E entity) {
        return mapper.map(entity, dtoClass);
    }
}
