package com.peirong.service.Implement;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peirong.entity.Files;
import com.peirong.mapper.FileMapper;
import com.peirong.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FileServiceImpl extends ServiceImpl<FileMapper, Files> implements FileService {
}
