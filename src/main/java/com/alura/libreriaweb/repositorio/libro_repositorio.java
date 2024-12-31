package com.alura.libreriaweb.repositorio;
import com.alura.libreriaweb.Items.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface libro_repositorio extends JpaRepository<Libro, Long> {
    boolean existsByTitulo(String titulo);

    Libro findByTituloContainsIgnoreCase(String titulo);

    List<Libro> findByIdioma(String idioma);


    @Query("SELECT l FROM Libro l ORDER BY l.cantidadDescargas DESC LIMIT 10")
    List<Libro> findTop10ByTituloByCantidadDescargas();
}
