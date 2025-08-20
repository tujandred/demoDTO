package io.github.tujandred.demodto.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {
    private Long id = 0L;
    private String nombre = "Nombre de prueba";
    private String descripcion = "Descripcion de prueba";

}
