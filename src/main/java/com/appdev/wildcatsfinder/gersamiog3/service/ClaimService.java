package com.appdev.wildcatsfinder.gersamiog3.service;

import com.appdev.wildcatsfinder.gersamiog3.entity.ClaimEntity;
import com.appdev.wildcatsfinder.gersamiog3.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

  private final ClaimRepository crepo;

  @Autowired
  public ClaimService(ClaimRepository crepo) {
    this.crepo = crepo;
  }

  public ClaimEntity create(ClaimEntity claim) {
    return crepo.save(claim);
  }

  public List<ClaimEntity> findAll() {
    return crepo.findAll();
  }

  public ClaimEntity findById(int cid) {
    // autoboxes int -> Integer once ClaimRepository uses Integer
    return crepo.findById(cid).orElseThrow(() -> new RuntimeException("Claim not found"));
  }

  public ClaimEntity updateClaim(int cid, ClaimEntity from) {
    ClaimEntity claim = findById(cid);
    claim.setClaimDate(from.getClaimDate());
    claim.setStatus(from.getStatus());
    claim.setFoundItemId(from.getFoundItemId()); // both are Integer now
    claim.setVerified(from.isVerified());
    return crepo.save(claim);
  }

  public void delete(int cid) {
    crepo.deleteById(cid);
  }
}
