package com.dirproveedor.dirproveedor.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dirproveedor.dirproveedor.entity.Categorias;
import com.dirproveedor.dirproveedor.entity.Empresas;
import com.dirproveedor.dirproveedor.entity.Users;
import com.dirproveedor.dirproveedor.services.EmpresasService;

@Controller
@RequestMapping("/api/v1/empresas")
@CrossOrigin(originPatterns = "*")
public class EmpresasController {
	@Autowired
	private EmpresasService empresasService;

	@Value("${upload.path}")
	private String uploadPath;

	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(empresasService.findAll());
	}

	@PostMapping
	public ResponseEntity<Empresas> save(@RequestParam("image") MultipartFile image,
			@RequestParam("nombre") String nombre,
			@RequestParam("email") String email,
			@RequestParam("telefono") String telefono,
			@RequestParam("website") String website,
			@RequestParam("facebook") String facebook,
			@RequestParam("youtube") String youtube,
			@RequestParam("tiktok") String tiktok,
			@RequestParam("descripcion") String descripcion,
			@RequestParam("publicado") boolean publicado,
			@RequestParam("visitas") int visitas,
			@RequestParam("categoriasID") Long categoriasID,
			@RequestParam("usersID") Long usersID) {

		Empresas empresas = new Empresas();
		empresas.setNombre(nombre);
		empresas.setEmail(email);
		empresas.setTelefono(telefono);
		empresas.setWebsite(website);
		empresas.setFacebook(facebook);
		empresas.setYoutube(youtube);
		empresas.setTiktok(tiktok);
		empresas.setDescripcion(descripcion);
		Users users = new Users();
		users.setId(usersID);
		empresas.setUsers(users);
		Categorias categorias = new Categorias();
		categorias.setId(categoriasID);
		empresas.setCategorias(categorias);

		if (image != null && !image.isEmpty()) {
			try {
				Path directoryPath = Paths.get(uploadPath);
                if (!Files.exists(directoryPath)) {
                    Files.createDirectories(directoryPath);
                }
				String uniqueFilename = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
				System.out.println(uniqueFilename.length());
				System.out.println(uniqueFilename);
				Path imagePath = Paths.get(uploadPath, uniqueFilename);
				Files.copy(image.getInputStream(), imagePath);
				empresas.setUrlfoto(uniqueFilename);
			} catch (IOException e) {
				e.printStackTrace();
				// Maneja el error
			}
		}

		return ResponseEntity.status(HttpStatus.CREATED).body(empresasService.save(empresas));
	}
}
