package ru.zateev.springsecuritytest.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "notice_details"
)
public class Notice {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "notice_id"
    )
    private int noticeId;
    @Column(
            name = "notice_summary"
    )
    private String noticeSummary;
    @Column(
            name = "notice_details"
    )
    private String noticeDetails;
    @Column(
            name = "notic_beg_dt"
    )
    private Date noticBegDt;
    @Column(
            name = "notic_end_dt"
    )
    private Date noticEndDt;
    @Column(
            name = "create_dt"
    )
    private Date createDt;
    @Column(
            name = "update_dt"
    )
    private Date updateDt;

    public Notice() {
    }

    public int getNoticeId() {
        return this.noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeSummary() {
        return this.noticeSummary;
    }

    public void setNoticeSummary(String noticeSummary) {
        this.noticeSummary = noticeSummary;
    }

    public String getNoticeDetails() {
        return this.noticeDetails;
    }

    public void setNoticeDetails(String noticeDetails) {
        this.noticeDetails = noticeDetails;
    }

    public Date getNoticBegDt() {
        return this.noticBegDt;
    }

    public void setNoticBegDt(Date noticBegDt) {
        this.noticBegDt = noticBegDt;
    }

    public Date getNoticEndDt() {
        return this.noticEndDt;
    }

    public void setNoticEndDt(Date noticEndDt) {
        this.noticEndDt = noticEndDt;
    }

    public Date getCreateDt() {
        return this.createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return this.updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }
}
