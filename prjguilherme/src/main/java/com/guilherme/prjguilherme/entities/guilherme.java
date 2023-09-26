package com.guilherme.prjguilherme.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class guilherme {
	
	//idcCliente , ncliente ,fone
	
		//atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		private Long idcCliente;
		
		@Column(name = "ncliente")
		
		private String ncliente;
		
		@Column(name = "fone")
		private String fone ;
		
		//construtor vazio
		public guilherme() {
			
		}
		
		//construtor com parametros
		public guilherme(Long idcCliente, String ncliente, String fone) {
			super();
			this.idcCliente = idcCliente;
			this.ncliente = ncliente;
			this.fone = fone;
		}
		//método de acesso
		public Long getIdcCliente() {
			return idcCliente;
		}
		
		public void setIdcCliente(Long idcCliente) {
			this.idcCliente = idcCliente;
		}
		
		//método de acesso
		public String getncliente() {
			return ncliente;
		}
			
		public void setncliente(String ncliente) {
			this.ncliente = ncliente;
		}
		
		//método de acesso
		public String getfone() {
			return fone;
		}
			
		public void setfone(String fone) {
			this.fone = fone;
		}
		
		

}
