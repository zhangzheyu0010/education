package com.baizhi.controller;

import com.baizhi.constants.UploadPrefix;
import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("product")
public class ProductController {
    @Resource
    private ProductService productService;
    // 将工厂中的属性进行注入
    @Value("${upload.dir}")
    private String realPath;

    /**
     * 课程列表
     *
     * @return 所有课程的集合
     */
    @GetMapping("queryProduct")
    public Map<String,Object> queryAll(@RequestParam (value= "page",defaultValue = "1")Integer page,@RequestParam(value="rows",defaultValue = "5")Integer rows){
        HashMap<String,Object> result=new HashMap<>();
        List<Product> products=productService.queryAllProduct(page, rows);
        Long total=productService.queryTotalRow();
        result.put("products",products);
        result.put("total",total);
        return result;
    }
    @PostMapping("upload")
    public String upload(MultipartFile file)throws IOException{
        //创建日期目录
        String dateString= LocalDate.now().toString();
        File dateDir=new File(realPath,dateString);
        if(!dateDir.exists()) dateDir.mkdir();
        //处理上传文件名称
        String extension= FilenameUtils.getExtension(file.getOriginalFilename());
        String newFileName= UUID.randomUUID().toString().replace("-","")+"."+extension;
        // 处理文件上传
        file.transferTo(new File(dateDir, newFileName));
        // 返回文件上传后的服务器全路径  http://localhost:8989/admin/2021-09-16/68b0e29c296d495f9b1891d21d8c0810.jpg
        return UploadPrefix.IMG_URL + dateString + "/" + newFileName;
    }
    @PostMapping("insertProduct")
    public void insert(@RequestBody Product product){
        System.out.println(product);
        productService.insertService(product);
    }
    @DeleteMapping("deleteProduct/{id}")
    public void delete(@PathVariable("id") Integer id){
        productService.deleteService(id);
    }
    @PutMapping("updateProduct")
    public void update(@RequestBody Product product){
        productService.updateService(product);
    }
    @GetMapping("queryOne/{id}")
    public Product queryOne(@PathVariable("id") Integer id){
        System.out.println("id = " + id);
        return  productService.queryOneService(id);
    }
}
