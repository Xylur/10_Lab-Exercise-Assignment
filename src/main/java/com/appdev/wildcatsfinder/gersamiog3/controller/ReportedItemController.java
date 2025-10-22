package com.appdev.wildcatsfinder.gersamiog3.controller;

import com.appdev.wildcatsfinder.gersamiog3.entity.ReportedItemEntity;
import com.appdev.wildcatsfinder.gersamiog3.service.ReportedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reported-items")
public class ReportedItemController {

  private final ReportedItemService service;

  @Autowired
  public ReportedItemController(ReportedItemService service) {
    this.service = service;
  }

  @PostMapping("/createReportedItem")
  @ResponseStatus(HttpStatus.CREATED)
  public ReportedItemEntity create(@RequestBody ReportedItemEntity body) {
    return service.create(body);
  }

  @GetMapping("/getAllReportedItem")
  public List<ReportedItemEntity> all() {
    return service.findAll();
  }

  @GetMapping("/getReportedItem/{rid}")
  public ReportedItemEntity one(@PathVariable int rid) {
    return service.findById(rid);
  }

  @PutMapping("/updateReportedItem/{rid}")
  public ReportedItemEntity update(@PathVariable int rid, @RequestBody ReportedItemEntity body) {
    return service.updateReportedItem(rid, body);
  }

  @DeleteMapping("/deleteReportedItem/{rid}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable int rid) {
    service.delete(rid);
  }
}
