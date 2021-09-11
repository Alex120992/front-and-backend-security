package ru.zateev.springsecuritytest.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Locale;
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
    private LocalDate noticBegDt;
    @Column(
            name = "notic_end_dt"
    )
    private LocalDate noticEndDt;
    @Column(
            name = "create_dt"
    )
    private LocalDate createDt;
    @Column(
            name = "update_dt"
    )
    private LocalDate updateDt;

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

    public LocalDate getNoticBegDt() {
        return noticBegDt;
    }

    public void setNoticBegDt(LocalDate noticBegDt) {
        this.noticBegDt = noticBegDt;
    }

    public LocalDate getNoticEndDt() {
        return noticEndDt;
    }

    public void setNoticEndDt(LocalDate noticEndDt) {
        this.noticEndDt = noticEndDt;
    }

    public LocalDate getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }

    public LocalDate getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDate updateDt) {
        this.updateDt = updateDt;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", noticeSummary='" + noticeSummary + '\'' +
                ", noticeDetails='" + noticeDetails + '\'' +
                ", noticBegDt=" + noticBegDt +
                ", noticEndDt=" + noticEndDt +
                ", createDt=" + createDt +
                ", updateDt=" + updateDt +
                '}';
    }
}
