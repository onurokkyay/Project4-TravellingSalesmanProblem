/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2proje1yeni;

import java.util.ArrayList;
import java.util.List;
 
public class PermutateArray {
 
	
	int[]dizi;

    public PermutateArray(int[] dizi) {
        this.dizi = dizi;
    }
		
	
	public List<List<Integer>> permute(int[] arr) {
		List<List<Integer>> list = new ArrayList<>();
		permuteHelper(list, new ArrayList<>(), arr);
		return list;
	}
 
	private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr){
 
		// Base case
		if(resultList.size() == arr.length){
			list.add(new ArrayList<>(resultList));
		} 
		else{
			for(int i = 0; i < arr.length; i++){ 
 
				if(resultList.contains(arr[i])) 
				{
					// If element already exists in the list then skip
					continue; 
				}
				// Choose element
				resultList.add(arr[i]);
				// Explore
				permuteHelper(list, resultList, arr);
				// Unchoose element
				resultList.remove(resultList.size() - 1);
			}
		}
	} 
 
}
 
