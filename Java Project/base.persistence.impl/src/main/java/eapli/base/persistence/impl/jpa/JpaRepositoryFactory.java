/*
 * Copyright (c) 2013-2021 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.agv.repositories.AGVRepository;
import eapli.base.agv.repositories.InfoRepository;
import eapli.base.agv.repositories.TaskRepository;
import eapli.base.category.repositories.CategoryRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.customer.repositories.CustomerRepository;
import eapli.base.importwarehouse.repositories.WarehouseRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.order.repositories.OrderRepository;
import eapli.base.product.repositories.ProductRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.JpaAutoTxUserRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

/**
 *
 * Created by nuno on 21/03/16.
 */
public class JpaRepositoryFactory implements RepositoryFactory {

    @Override
    public UserRepository users(final TransactionalContext autoTx) {
        return new JpaAutoTxUserRepository(autoTx);
    }

    @Override
    public UserRepository users() {
        return new JpaAutoTxUserRepository(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

    @Override
    public JpaClientUserRepository clientUsers(final TransactionalContext autoTx) {
        return new JpaClientUserRepository(autoTx);
    }

    @Override
    public JpaClientUserRepository clientUsers() {
        return new JpaClientUserRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext autoTx) {
        return new JpaSignupRequestRepository(autoTx);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return new JpaSignupRequestRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public CategoryRepository category(final TransactionalContext autoTx) {
        return new JpaCategoryRepository(autoTx);
    }

    @Override
    public CategoryRepository category() {
        return new JpaCategoryRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public ProductRepository products(final TransactionalContext autoTx) {
        return new JpaProductRepository(autoTx);
    }

    @Override
    public ProductRepository products() {
        return new JpaProductRepository(Application.settings().getPersistenceUnitName());
    }



    @Override
    public OrderRepository order(TransactionalContext autoTx) {
        return new JpaOrderRepository(autoTx);
    }

    @Override
    public OrderRepository order() {
        return new JpaOrderRepository(Application.settings().getPersistenceUnitName());
    }


    @Override
    public CustomerRepository customers(final TransactionalContext autoTx) {
        return new JpaCustomerRepository(autoTx);
    }

    @Override
    public CustomerRepository customers() {
        return new JpaCustomerRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public TaskRepository tasks() { return new JpaTaskRepository();}

    @Override
    public AGVRepository agv() {
        return null;
    }

    @Override
    public AGVRepository agvs(TransactionalContext autoTx) {
        return new JpaAGVRepository(autoTx);
    }

    @Override
    public AGVRepository agvs() {
        return new JpaAGVRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public InfoRepository info() {
        return null;
    }

    @Override
    public WarehouseRepository warehouse() {
        return null;
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        return JpaAutoTxRepository.buildTransactionalContext(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

}
