package com.appdev.wildcatsfinder.gersamiog3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Entity
@Table(name = "claim")
public class ClaimEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "claim_id")
  private int cid;

  @Column(name = "claim_date", nullable = false)
  private LocalDate claimDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 32)
  private ClaimStatus status;

  @Column(name = "found_itemid")
  private int foundItemId;

  @Column(name = "verified", nullable = false)
  private boolean verified = false;

  // getters & setters

  public int getId() { 
    return cid; 
}
  public void setId(int cid) {
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
  public int getFoundItemId() { 
    return foundItemId; 
}
  public void setFoundItemId(Long foundItemId) {
    this.foundItemId = foundItemId; 
}

  public boolean isVerified() { 
    return verified; 
}
  public void setVerified(boolean verified) {
    this.verified = verified; 
}
}
