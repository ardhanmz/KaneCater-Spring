package com.ardhanmz.kanecater.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ms_payment_detail", schema = "kanecater", catalog = "")
public class MsPaymentDetailEntity {
    private int uuidPaymentDetail;
    private Timestamp dtmCrt;
    private String usrCrt;
    private Timestamp dtmUpd;
    private String usrUpd;
    private String paymentCode;
    private String paymentName;
    private String paymentAccount;

    @Id
    @Column(name = "UUID_PAYMENT_DETAIL")
    public int getUuidPaymentDetail() {
        return uuidPaymentDetail;
    }

    public void setUuidPaymentDetail(int uuidPaymentDetail) {
        this.uuidPaymentDetail = uuidPaymentDetail;
    }

    @Basic
    @Column(name = "DTM_CRT")
    public Timestamp getDtmCrt() {
        return dtmCrt;
    }

    public void setDtmCrt(Timestamp dtmCrt) {
        this.dtmCrt = dtmCrt;
    }

    @Basic
    @Column(name = "USR_CRT")
    public String getUsrCrt() {
        return usrCrt;
    }

    public void setUsrCrt(String usrCrt) {
        this.usrCrt = usrCrt;
    }

    @Basic
    @Column(name = "DTM_UPD")
    public Timestamp getDtmUpd() {
        return dtmUpd;
    }

    public void setDtmUpd(Timestamp dtmUpd) {
        this.dtmUpd = dtmUpd;
    }

    @Basic
    @Column(name = "USR_UPD")
    public String getUsrUpd() {
        return usrUpd;
    }

    public void setUsrUpd(String usrUpd) {
        this.usrUpd = usrUpd;
    }

    @Basic
    @Column(name = "PAYMENT_CODE")
    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    @Basic
    @Column(name = "PAYMENT_NAME")
    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    @Basic
    @Column(name = "PAYMENT_ACCOUNT")
    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MsPaymentDetailEntity that = (MsPaymentDetailEntity) o;
        return uuidPaymentDetail == that.uuidPaymentDetail && Objects.equals(dtmCrt, that.dtmCrt) && Objects.equals(usrCrt, that.usrCrt) && Objects.equals(dtmUpd, that.dtmUpd) && Objects.equals(usrUpd, that.usrUpd) && Objects.equals(paymentCode, that.paymentCode) && Objects.equals(paymentName, that.paymentName) && Objects.equals(paymentAccount, that.paymentAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidPaymentDetail, dtmCrt, usrCrt, dtmUpd, usrUpd, paymentCode, paymentName, paymentAccount);
    }
}
