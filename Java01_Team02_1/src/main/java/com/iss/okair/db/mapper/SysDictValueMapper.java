package com.iss.okair.db.mapper;

import java.util.List;

import com.iss.okair.db.entity.SysDictValue;

public interface SysDictValueMapper {
	List< SysDictValue> find( SysDictValue example);
	List< SysDictValue> selectByExample( SysDictValue example);
	List< SysDictValue> getTypeCode( String typeCode);
	List< SysDictValue> getCity(String  city);
}
