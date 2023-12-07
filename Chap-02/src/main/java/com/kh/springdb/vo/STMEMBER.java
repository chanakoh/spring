package com.kh.springdb.vo;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name="STUDENT_MEMBER")
public class STMEMBER {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="st_Seq")
	@SequenceGenerator(name="st_seq",sequenceName="st_Seq",allocationSize=1)
	private Long STNumber;
	private String memberName;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
}
