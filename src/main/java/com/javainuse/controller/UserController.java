package com.javainuse.controller;

import com.javainuse.exception.ResourceNotFoundException;
import com.javainuse.model.DAOUser;
import com.javainuse.dao.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserData userdata;
	// Get All Notes
	@GetMapping("/users")
	public List<DAOUser> getAllUsers() {
	    return userdata.findAll();
	}
    // Create a new Note

    // Get a Single Note

    // Update a Note

    // Delete a Note
}
