package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LoginDAO;

@Service
public class LoginService {

	@Autowired
	LoginDAO dao;
}
