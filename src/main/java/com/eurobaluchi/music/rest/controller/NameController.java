package com.eurobaluchi.music.rest.controller;

import com.eurobaluchi.music.rest.domain.Name;
import com.eurobaluchi.music.rest.dto.NameDto;
import com.eurobaluchi.music.rest.service.NameService;
import com.eurobaluchi.music.rest.utils.Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/names")
@Api(value="onlinestore", description="Operations pertaining to names in Online music")
public class NameController extends BaseController<Name, NameDto, Integer, NameService>{

    //private NameService nameService;
    @Autowired
    public NameController(NameService service){
        super(service);
    }


    @ApiOperation(value = "View a list of available names", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping("/music/names")
    public List<Name> restGet(){
        String message = "get all names";
        System.out.println(message);
        return list();
    }

    @GetMapping("/music/names/{name-id}")
    public Name restGet(@PathVariable(value = Utils.NAME_ID) Integer id){
        String message = "get all names";
        System.out.println(message);
        return show(id);
    }

    @ApiOperation(value = "reate a name ", response = Name.class)
    @PostMapping("/music/names")
    public Name create(@RequestBody NameDto dto){
        String message = "create a name";
        System.out.println(message);
        return create(dto, Name.class);
    }
}
