package com.techlabs.mappings.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	@Column
	private String courseName;
	@Column
	private int duration;	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="instructorid")
	@JsonBackReference
	private Instructor instructor;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="course_id"),
    inverseJoinColumns = @JoinColumn(name="roll_number"))
	private List<Student> students;

}
