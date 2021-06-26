package com.ardhanmz.kanecater.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ms_payment_status", schema = "kanecater", catalog = "")
public class MsPaymentStatusEntity {
    private int uuidPaymentStatus;
    private Timestamp dtmCrt;
    private String usrCrt;
    private Timestamp dtmUpd;
    private String usrUpd;
    private String paymentStatus;

    @Id
    @Column(name = "UUID_PAYMENT_STATUS")
    public int getUuidPaymentStatus() {
        return uuidPaymentStatus;
    }

    public void setUuidPaymentStatus(int uuidPaymentStatus) {
        this.uuidPaymentStatus = uuidPaymentStatus;
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
    @Column(name = "PAYMENT_STATUS")
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MsPaymentStatusEntity that = (MsPaymentStatusEntity) o;
        return uuidPaymentStatus == that.uuidPaymentStatus && Objects.equals(dtmCrt, that.dtmCrt) && Objects.equals(usrCrt, that.usrCrt) && Objects.equals(dtmUpd, that.dtmUpd) && Objects.equals(usrUpd, that.usrUpd) && Objects.equals(paymentStatus, that.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidPaymentStatus, dtmCrt, usrCrt, dtmUpd, usrUpd, paymentStatus);
    }
}
