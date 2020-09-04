package m07.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GiftDetail")
public class GiftDetail {
	@Id
	@GeneratedValue
	Integer id;
	
	int quantity;
	int productId;
	int promoDetail_id;
}
