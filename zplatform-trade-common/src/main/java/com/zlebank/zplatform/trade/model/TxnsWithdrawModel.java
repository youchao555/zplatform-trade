package com.zlebank.zplatform.trade.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zlebank.zplatform.commons.utils.DateUtil;
import com.zlebank.zplatform.trade.bean.TradeBean;
import com.zlebank.zplatform.trade.bean.wap.WapWithdrawAccBean;
import com.zlebank.zplatform.trade.bean.wap.WapWithdrawBean;
import com.zlebank.zplatform.trade.utils.OrderNumber;

/**
 * TTxnsWithdraw generated by hbm2java
 */
@Entity
@Table(name = "T_TXNS_WITHDRAW")
public class TxnsWithdrawModel implements java.io.Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5624809894940365318L;
    private long id;
    private String withdraworderno;
    private String batchno;
    private String memberid;
    private String withdrawtype;
    private Long amount;
    private String acctno;
    private String acctname;
    private String bankcode;
    private String bankname;
    private Long fee;
    private String txntime;
    private String finishtime;
    private String status;
    private String withdrawinstid;
    private String retcode;
    private String retinfo;
    private Long inuser;
    private Date intime;
    private Long stexauser;
    private Date stexatime;
    private String stexaopt;
    private Long cvlexauser;
    private Date cvlexatime;
    private String cvlexaopt;
    private String notes;
    private String remarks;
    private String gatewayorderno;
    private String texnseqno;
    public TxnsWithdrawModel (){
    }

    public TxnsWithdrawModel(long id, Date intime) {
        this.id = id;
        this.intime = intime;
    }
    public TxnsWithdrawModel(long id, String withdraworderno, String batchno,
            String memberid, String withdrawtype, Long amount,
            String acctno, String acctname, String bankcode, String bankname,
            Long fee, String txntime, String finishtime, String status,
            String withdrawinstid, String retcode, String retinfo, Long inuser,
            Date intime, Long stexauser, Date stexatime, String stexaopt,
            Long cvlexauser, Date cvlexatime, String cvlexaopt, String notes,
            String remarks) {
        this.id = id;
        this.withdraworderno = withdraworderno;
        this.batchno = batchno;
        this.memberid = memberid;
        this.withdrawtype = withdrawtype;
        this.amount = amount;
        this.acctno = acctno;
        this.acctname = acctname;
        this.bankcode = bankcode;
        this.bankname = bankname;
        this.fee = fee;
        this.txntime = txntime;
        this.finishtime = finishtime;
        this.status = status;
        this.withdrawinstid = withdrawinstid;
        this.retcode = retcode;
        this.retinfo = retinfo;
        this.inuser = inuser;
        this.intime = intime;
        this.stexauser = stexauser;
        this.stexatime = stexatime;
        this.stexaopt = stexaopt;
        this.cvlexauser = cvlexauser;
        this.cvlexatime = cvlexatime;
        this.cvlexaopt = cvlexaopt;
        this.notes = notes;
        this.remarks = remarks;
    }
    public TxnsWithdrawModel(WapWithdrawBean withdrawBean,WapWithdrawAccBean withdrawAccBean) {
        this.id = OrderNumber.getInstance().generateID();
        this.withdraworderno = OrderNumber.getInstance().generateWithdrawOrderNo();
        this.memberid = withdrawBean.getMemberId();
        if(withdrawBean.getMemberId().startsWith("1")){
            this.withdrawtype = "0";
        }else {
            this.withdrawtype = "1";
        }
        this.amount =Long.valueOf(withdrawBean.getAmount());
        this.acctno = withdrawAccBean.getAccNo();
        this.acctname = withdrawAccBean.getAccName();
        this.bankcode = withdrawAccBean.getBankCode();
        this.bankname = withdrawAccBean.getBankName();
        this.txntime = DateUtil.getCurrentDateTime();
        this.status = "01";
        this.intime = new Date();
        this.gatewayorderno=withdrawBean.getOrderId();
       
    }
    
    public TxnsWithdrawModel(TradeBean tradeBean) {
        this.id = 1L;
        this.withdraworderno = OrderNumber.getInstance().generateWithdrawOrderNo();
        this.memberid = tradeBean.getMerUserId();
        if(tradeBean.getMerUserId().startsWith("1")){
            this.withdrawtype = "0";
        }else {
            this.withdrawtype = "1";
        }
        this.acctno=tradeBean.getCardNo();
        this.acctname = tradeBean.getAcctName();
        this.amount = Long.valueOf(tradeBean.getAmount());
        this.bankcode = tradeBean.getBankCode();
        //this.bankname = tradeBean.getb
        this.status = "01";
        this.intime = new Date();
        this.gatewayorderno = tradeBean.getOrderId();
        this.texnseqno = tradeBean.getTxnseqno();
    }
    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 12, scale = 0)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "WITHDRAWORDERNO", unique = true, length = 32)
    public String getWithdraworderno() {
        return this.withdraworderno;
    }

    public void setWithdraworderno(String withdraworderno) {
        this.withdraworderno = withdraworderno;
    }

    @Column(name = "BATCHNO", length = 32)
    public String getBatchno() {
        return this.batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Column(name = "MEMBERID", length = 15)
    public String getMemberid() {
        return this.memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    @Column(name = "WITHDRAWTYPE", length = 1)
    public String getWithdrawtype() {
        return this.withdrawtype;
    }

    public void setWithdrawtype(String withdrawtype) {
        this.withdrawtype = withdrawtype;
    }

    @Column(name = "AMOUNT", precision = 12, scale = 0)
    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "ACCTNO", length = 32)
    public String getAcctno() {
        return this.acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    @Column(name = "ACCTNAME", length = 64)
    public String getAcctname() {
        return this.acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    @Column(name = "BANKCODE", length = 8)
    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Column(name = "BANKNAME", length = 64)
    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Column(name = "FEE", precision = 12, scale = 0)
    public Long getFee() {
        return this.fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    @Column(name = "TXNTIME", length = 14)
    public String getTxntime() {
        return this.txntime;
    }

    public void setTxntime(String txntime) {
        this.txntime = txntime;
    }

    @Column(name = "FINISHTIME", length = 14)
    public String getFinishtime() {
        return this.finishtime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
    }

    @Column(name = "STATUS", length = 2)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "WITHDRAWINSTID", length = 8)
    public String getWithdrawinstid() {
        return this.withdrawinstid;
    }

    public void setWithdrawinstid(String withdrawinstid) {
        this.withdrawinstid = withdrawinstid;
    }

    @Column(name = "RETCODE", length = 8)
    public String getRetcode() {
        return this.retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    @Column(name = "RETINFO", length = 256)
    public String getRetinfo() {
        return this.retinfo;
    }

    public void setRetinfo(String retinfo) {
        this.retinfo = retinfo;
    }

    @Column(name = "INUSER", precision = 10, scale = 0)
    public Long getInuser() {
        return this.inuser;
    }

    public void setInuser(Long inuser) {
        this.inuser = inuser;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "INTIME", nullable = false, length = 7)
    public Date getIntime() {
        return this.intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Column(name = "STEXAUSER", precision = 10, scale = 0)
    public Long getStexauser() {
        return this.stexauser;
    }

    public void setStexauser(Long stexauser) {
        this.stexauser = stexauser;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "STEXATIME", length = 7)
    public Date getStexatime() {
        return this.stexatime;
    }

    public void setStexatime(Date stexatime) {
        this.stexatime = stexatime;
    }

    @Column(name = "STEXAOPT", length = 256)
    public String getStexaopt() {
        return this.stexaopt;
    }

    public void setStexaopt(String stexaopt) {
        this.stexaopt = stexaopt;
    }

    @Column(name = "CVLEXAUSER", precision = 10, scale = 0)
    public Long getCvlexauser() {
        return this.cvlexauser;
    }

    public void setCvlexauser(Long cvlexauser) {
        this.cvlexauser = cvlexauser;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CVLEXATIME", length = 7)
    public Date getCvlexatime() {
        return this.cvlexatime;
    }

    public void setCvlexatime(Date cvlexatime) {
        this.cvlexatime = cvlexatime;
    }

    @Column(name = "CVLEXAOPT", length = 256)
    public String getCvlexaopt() {
        return this.cvlexaopt;
    }

    public void setCvlexaopt(String cvlexaopt) {
        this.cvlexaopt = cvlexaopt;
    }

    @Column(name = "NOTES", length = 256)
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "REMARKS", length = 256)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the gatewayorderno
     */
    @Column(name = "GATEWAYORDERNO", length = 32)
    public String getGatewayorderno() {
        return gatewayorderno;
    }

    /**
     * @param gatewayorderno the gatewayorderno to set
     */
    public void setGatewayorderno(String gatewayorderno) {
        this.gatewayorderno = gatewayorderno;
    }

    /**
     * @return the texnseqno
     */
    @Column(name="TXNSEQNO",length=16)
    public String getTexnseqno() {
        return texnseqno;
    }

    /**
     * @param texnseqno the texnseqno to set
     */
    public void setTexnseqno(String texnseqno) {
        this.texnseqno = texnseqno;
    }

}
