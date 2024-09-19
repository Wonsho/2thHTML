package org.example.test.wons.first.helper.service;

import org.example.test.wons.first.helper.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultTestService implements TestService {

    @Autowired
    private TestRepository repository;
}
