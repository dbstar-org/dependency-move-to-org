package io.github.dbstarll.test;

public class Service {
    private Bean savedBean;

    /**
     * 获得bean.
     *
     * @return bean
     */
    public Bean loadBean() {
        return savedBean;
    }

    /**
     * 保存bean.
     *
     * @param bean bean
     */
    public void saveBean(final Bean bean) {
        this.savedBean = bean;
    }
}
