package com.flm.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.flm.dao.ItemRepository;
import com.flm.dto.ItemRequestDto;
import com.flm.dto.ItemResponseDto;
import com.flm.model.Item;
import com.flm.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	private final ItemRepository itemRepository;

	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository= itemRepository;
	}

	@Override
	public ItemResponseDto save(ItemRequestDto itemRequestDto) {
		Item item = new Item();
		item.setItemName(itemRequestDto.getItemName() );
		item.setPrice(itemRequestDto.getPrice() );
		item.setDiscount(itemRequestDto.getDiscount() );
		item.setStock(itemRequestDto.getStock());
		item.setAvailable(true);
		Item savedItem = itemRepository.save(item);

		ItemResponseDto itemResponseDto = new ItemResponseDto();
		BeanUtils.copyProperties(savedItem, itemResponseDto);
		return itemResponseDto;
	}

}
