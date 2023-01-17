package io.github.dbstarll.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    @Test
    void bean() {
        final Service service = new Service();
        final Bean bean = new Bean();
        bean.setName("abc");

        assertNull(service.loadBean());

        service.saveBean(bean);
        final Bean loaded = service.loadBean();
        assertNotNull(loaded);
        assertSame(bean, loaded);
    }
}