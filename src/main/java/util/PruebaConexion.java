package util;

import javax.persistence.EntityManager;

public class PruebaConexion {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		if (em != null) {
			System.out.println("CONEXION EXITOSA");
		}
		
		em.close();
		JPAUtil.close();
	}
}