package com.xworkz.bluetooth.service;

import com.xworkz.bluetooth.dto.BluetoothDto;
import com.xworkz.bluetooth.repository.BluetoothRepo;
import com.xworkz.bluetooth.repository.BluetoothRepoImpl;

public class BluetoothServiceImpl implements BluetoothService {

	@Override
	public boolean save(BluetoothDto dto) {
		System.out.println("this is service class");
		
		BluetoothRepo repo=new BluetoothRepoImpl();
		boolean saved=repo.save(dto);
		
		System.out.println("this data saved successfully:"+saved);
		return true;
	}

}
