package com.educandoweb.coursejava.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.educandoweb.coursejava.entities.Category;
import com.educandoweb.coursejava.services.CategoryService;

class CategoryServiceTest {
	CategoryService mockService;
	List<Category> mockCategories;
	

	@BeforeEach
	void setup() {
		mockService = mock(CategoryService.class);
		
				
	}
	@Test
	@DisplayName("When Find All Category Should Return Category all Categories")
	void testWhen_FindAllCategory_ShouldReturnAllCategories() {
		// Given // Arrange
		mockCategories = Arrays.asList(
	            new Category(1L, "Electronics"),
	            new Category(2L, "Books")
	        );
		
		when(mockService.findAll()).thenReturn(mockCategories); 
		
		// When // Act
		List<Category> categories = mockService.findAll();
		
		// Then // Assert
		assertNotNull(categories); 
        assertEquals(2, categories.size()); 
        assertEquals("Electronics", categories.get(0).getName()); 
        assertEquals("Books", categories.get(1).getName()); 
	}

	@Test
	@DisplayName("When Find By ID Category Should Return Category By ID")
	void testWhen_FindCategoryByID_ShouldReturnCategoryByID() {
		// Given // Arrange
		Category mockCategory = new Category(1L, "Eletronics");
		when(mockService.findById(1L)).thenReturn(mockCategory);
		
		// When // Act
		var result = mockService.findById(1L);
			
		// Then // Assert
		assertNotNull(result); 
        assertEquals(mockCategory.getId(), result.getId()); 
        assertEquals(mockCategory.getName(), result.getName()); 

	}
}
