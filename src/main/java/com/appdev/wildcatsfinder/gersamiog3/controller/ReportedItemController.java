package com.appdev.wildcatsfinder.gersamiog3.controller;

import com.appdev.wildcatsfinder.gersamiog3.entity.ReportedItemEntity;
import com.appdev.wildcatsfinder.gersamiog3.service.ReportedItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/reported-items")
public class ReportedItemController {

  private final ReportedItemService service;
  public ReportedItemController(ReportedItemService service) { 
    this.service = service; 
 }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ReportedItemEntity create(@Valid @RequestBody ReportedItemEntity body) {
    return service.create(body);
  }

  @GetMapping ("/getAllReportedItem")
  public List<ReportedItemEntity> all() { 
    return service.findAll(); 
  }

  @GetMapping("/getReportedItem") public ReportedItemEntity one(@PathVariable int rid) { 
    return service.findById(rid); 
}

  @PutMapping("/updateReportedItem")
  public ReportedItemEntity updateReportedItem(@PathVariable int rid, @Valid @RequestBody ReportedItemEntity body) {
    return service.updateReportedItem(rid, body);
  }

  @DeleteMapping("/deleteReportedItem")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteReportedItem(@PathVariable int rid) { service.delete(rid); }
}
