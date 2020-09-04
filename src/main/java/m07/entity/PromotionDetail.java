package m07.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PromotionDetail")
public class PromotionDetail {
	@Id
	@GeneratedValue
	Integer id;
	
	String type;
	int percent;
	
	int promoId;
	int productId;
	int promoDetail_id;
	
}
