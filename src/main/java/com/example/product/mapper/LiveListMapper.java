package com.example.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.product.domain.LiveList;

@Mapper
public interface LiveListMapper {

	List<LiveList> findAll();

	//	/**
	//	 * 公演日の一覧を取得。
	//	 *
	//	 * @return 公演日の一覧
	//	 */
	//	@Select("SELECT * FROM live_list ORDER BY dateId ASC")
	//	List<LiveList> select();
	//
	//	/**
	//	 * 公演日を取得します。
	//	 *
	//	 * @param dateId 日付ID
	//	 * @return 公演日
	//	 */
	//	@Select("SELECT * FROM live_list WHERE dateId = #{dateId}")
	//	LiveList selectPK(int dateId);
	//
	//		/**
	//		 * 日付計算式を新規登録します。
	//		 *
	//		 * @param formula 登録する日付計算式
	//		 */
	//		@Insert("INSERT INTO dateformula VALUES(#{dateId}, #{dateName}, #{adjustmentYear}, #{adjustmentMonth}, #{adjustmentDay})")
	//		void insert(DateFormula formula);
	//
	//		/**
	//		 * 日付計算式を更新します。
	//		 *
	//		 * @param formula 登録する日付計算式
	//		 */
	//		@Update("UPDATE dateformula SET dateName = #{dateName},  adjustmentYear = #{adjustmentYear}, adjustmentMonth = #{adjustmentMonth}, adjustmentDay = #{adjustmentDay} WHERE dateId = #{dateId}")
	//		void update(DateFormula formula);
	//
	//		/**
	//		 * 日付計算式を削除します。
	//		 *
	//		 * @param dateId 日付ID
	//		 */
	//		@Delete("DELETE FROM dateformula WHERE dateId = #{dateId}")
	//		void deletePK(String dateId);

}
