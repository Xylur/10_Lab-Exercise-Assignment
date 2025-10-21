package com.appdev.wildcatsfinder.gersamiog3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reported_item")
public class ReportedItemEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rid")
  private int rid;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 32)
  private ReportStatus status;

  @Column(name = "date_report", nullable = false)
  private LocalDate dateReport;

  @Column(name = "time_report", nullable = false)
  private LocalTime timeReport;

  @Column(name = "dep_id")
  private Integer depId;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "lost_itemid")
  private Integer lostItemId;

  @Column(name = "found_itemid")
  private Integer foundItemId;

  @Column(name = "category_id")
  private Integer categoryId;

  @Column(name = "cat_description", length = 512)
  private String catDescription;

  // Getters & Setters
  public int getRid() { return rid; }
  public void setRid(int rid) { this.rid = rid; }
  public ReportStatus getStatus() { return status; }
  public void setStatus(ReportStatus status) { this.status = status; }
  public LocalDate getDateReport() { return dateReport; }
  public void setDateReport(LocalDate dateReport) { this.dateReport = dateReport; }
  public LocalTime getTimeReport() { return timeReport; }
  public void setTimeReport(LocalTime timeReport) { this.timeReport = timeReport; }
  public Integer getDepId() { return depId; }
  public void setDepId(Integer depId) { this.depId = depId; }
  public Integer getUserId() { return userId; }
  public void setUserId(Integer userId) { this.userId = userId; }
  public Integer getLostItemId() { return lostItemId; }
  public void setLostItemId(Integer lostItemId) { this.lostItemId = lostItemId; }
  public Integer getFoundItemId() { return foundItemId; }
  public void setFoundItemId(Integer foundItemId) { this.foundItemId = foundItemId; }
  public Integer getCategoryId() { return categoryId; }
  public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }
  public String getCatDescription() { return catDescription; }
  public void setCatDescription(String catDescription) { this.catDescription = catDescription; }
}
