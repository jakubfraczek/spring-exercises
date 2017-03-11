package pl.sda.beans;

import java.util.List;
import java.util.Map;

public class MyBean {
    private String code;
    private BeanVersion version;
    private List<String> altCodes;
    private List<SubBean> subBeens;
    private Map<String, CountryBean> nameToCountryBean;

    public MyBean(String code, BeanVersion version, List<String> altCodes) {
        this.code = code;
        this.version = version;
        this.altCodes = altCodes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BeanVersion getVersion() {
        return version;
    }

    public void setVersion(BeanVersion version) {
        this.version = version;
    }

    public List<String> getAltCodes() {
        return altCodes;
    }

    public void setAltCodes(List<String> altCodes) {
        this.altCodes = altCodes;
    }

    public List<SubBean> getSubBeens() {
        return subBeens;
    }

    public void setSubBeens(List<SubBean> subBeens) {
        this.subBeens = subBeens;
    }

    public Map<String, CountryBean> getNameToCountryBean() {
        return nameToCountryBean;
    }

    public void setNameToCountryBean(Map<String, CountryBean> nameToCountryBean) {
        this.nameToCountryBean = nameToCountryBean;
    }
}
