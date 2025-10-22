package com.appdev.wildcatsfinder.gersamiog3.service;

import com.appdev.wildcatsfinder.gersamiog3.entity.ReportedItemEntity;
import com.appdev.wildcatsfinder.gersamiog3.repository.ReportedItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReportedItemService {
  private final ReportedItemRepository repo;

  @Autowired
  public ReportedItemService(ReportedItemRepository repo) { this.repo = repo; }

  public ReportedItemEntity create(ReportedItemEntity item) { return repo.save(item); }
  public List<ReportedItemEntity> findAll() { return repo.findAll(); }
  public ReportedItemEntity findById(int rid) {
    return repo.findById(rid).orElseThrow(() -> new RuntimeException("Reported item not found"));
  }
  public ReportedItemEntity updateReportedItem(int rid, ReportedItemEntity from) {
    ReportedItemEntity item = findById(rid);
    item.setStatus(from.getStatus());
    item.setDateReport(from.getDateReport());
    item.setTimeReport(from.getTimeReport());
    item.setDepId(from.getDepId());
    item.setUserId(from.getUserId());
    item.setLostItemId(from.getLostItemId());
    item.setFoundItemId(from.getFoundItemId());
    item.setCategoryId(from.getCategoryId());
    item.setCatDescription(from.getCatDescription());
    return repo.save(item);
  }
  public void delete(int rid) { repo.deleteById(rid); }
}
