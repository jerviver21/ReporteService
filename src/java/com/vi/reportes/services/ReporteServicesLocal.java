
package com.vi.reportes.services;

import com.vi.reportes.dominio.Reporte;
import com.vi.reportes.dto.ResultReporteDTO;
import com.vi.comun.exceptions.LlaveDuplicadaException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ejb.Local;

/**
 * @author Jerson Viveros
 */
@Local
public interface ReporteServicesLocal {
    void create(Reporte param) throws LlaveDuplicadaException;

    void edit(Reporte param) throws LlaveDuplicadaException;

    void remove(Reporte param);

    Reporte find(Object id);

    List<Reporte> findAll();

    ResultReporteDTO generarReporte(Reporte reporte, Map<String, Object> params) throws Exception;

    List<Reporte> getReportesByProcesoAndRol(int proceso, Set<String> roles);
}
