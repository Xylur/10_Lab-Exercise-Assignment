package com.appdev.wildcatsfinder.gersamiog3.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "claim")
public class ClaimEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cid")
  private int cid;

  @Column(name = "claim_date", nullable = false)
  private LocalDate claimDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 32)
  private ClaimStatus status;

  // ✅ Use Integer (wrapper), not primitive int
  @Column(name = "found_itemid")
  private Integer foundItemId;

  @Column(name = "verified", nullable = false)
  private boolean verified = false;

  // getters/setters (note Integer types)
  public int getCid() { 
  return cid; 
 }
  public void setCid(int cid) { 
  this.cid = cid; 
 }
  public LocalDate getClaimDate() { 
  return claimDate; 
 }
  public void setClaimDate(LocalDate claimDate) { 
  this.claimDate = claimDate; 
 }
  public ClaimStatus getStatus() { 
  return status; 
 }
  public void setStatus(ClaimStatus status) { 
  this.status = status; 
 }
  public Integer getFoundItemId() { 
  return foundItemId; 
 }
  public void setFoundItemId(Integer foundItemId) { 
  this.foundItemId = foundItemId; 
 }
  public boolean isVerified() { 
  return verified; 
  }
  public void setVerified(boolean verified) { 
  this.verified = verified; 
  }
}
