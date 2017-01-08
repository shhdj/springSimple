package com.storesales.service.implement;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.storesales.model.ItemInfo;
import com.storesales.model.SaleFlow;
import com.storesales.query.model.ItemInfoQuery;
import com.storesales.query.model.EditItemInfoParam;
import com.storesales.query.model.SaleDataQuery;
import com.storesales.service.IItemInfoService;

@Service
public class ItemInfoServiceImpl implements IItemInfoService{
	@Override
	public List<ItemInfoQuery> getList() {
		return null;
	}

	@Override
	public List<SaleFlow> querySaleData(SaleDataQuery sale) {
		return null;
	}

	@Override
	public boolean update(EditItemInfoParam info) {
		return false;
	}

	@Override
	public boolean insert(ItemInfo info) {
		return false;
	}
}
