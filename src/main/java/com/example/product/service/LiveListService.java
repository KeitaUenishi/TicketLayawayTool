package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.product.domain.LiveList;
import com.example.product.mapper.LiveListMapper;

@Service
public class LiveListService {

	@Autowired
	private LiveListMapper liveListMapper;

	@Transactional(readOnly = true)
	public List<LiveList> findAll() {
		return liveListMapper.findAll();
	}

}
