package com.appdev.wildcatsfinder.gersamiog3.controller;

import com.appdev.wildcatsfinder.gersamiog3.entity.ClaimEntity;
import com.appdev.wildcatsfinder.gersamiog3.service.ClaimService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

  private final ClaimService service;
  public ClaimController(ClaimService service) {
    this.service = service;
  }

  @PostMapping("/createClaim")
  @ResponseStatus(HttpStatus.CREATED)
  public ClaimEntity create(@Valid @RequestBody ClaimEntity body) {
    return service.create(body);
  }

  @GetMapping("/getAllClaim")
  public List<ClaimEntity> all() {
    return service.findAll();
  }

  @GetMapping("/getClaim/{cid}")
  public ClaimEntity one(@PathVariable int cid) {
    return service.findById(cid);
  }

  @PutMapping("/updateClaim/{cid}")
  public ClaimEntity update(@PathVariable int cid, @Valid @RequestBody ClaimEntity body) {
    return service.updateClaim(cid, body);
  }

  @DeleteMapping("/deleteClaim/{cid}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable int cid) {
    service.delete(cid);
  }
}
